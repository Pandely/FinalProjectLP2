<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>

<script src='/webjars/AdminLTE/2.4.2/bower_components/jquery/dist/jquery.min.js'></script>
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
<!-- Main content -->
<section class="content">    
    <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Formulario de Registro</h3>
            </div>
    <c:url var="urlsave" value="${pageContext.request.contextPath}/guardar-sala" />
    <frm:form modelAttribute="modeloSala" method="POST" action="${urlsave}" class="form-horizontal" >
        
             <div class="box-body">
                <div class="form-group">
                    <frm:hidden path="idSala" />
                    <frm:label path="numero" class="col-sm-2 control-label" >Sala</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="numero" class="form-control" type="number" min="1" max="30"/>
                    </div>
                </div>
                <div class="form-group">                    
                    <frm:label path="capacidad" class="col-sm-2 control-label" >Capacidad</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="capacidad" class="form-control" type="number" min="20" max="180"/>
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="nFilas" class="col-sm-2 control-label" >Número de filas</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="nFilas" class="form-control" type="number" min="2" max="30"/>
                    </div>
                </div>
                <div class="form-group" >
                    <frm:label path="nColumnas" class="col-sm-2 control-label" >Número de columnas</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="nColumnas" class="form-control" type="number" min="10" max="30"/>
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="idFormato.idFormato" class="col-sm-2 control-label" >Calidad</frm:label>
                    <div class="col-sm-10">
                    <frm:select path="idFormato.idFormato" class="form-control">
                        <frm:options items="${listFormato}" itemLabel="nombre" itemValue="idFormato" />
                    </frm:select>                    
                    </div>
                    <frm:hidden path="idSucursal.idSucursal" value="${1}"/>
                </div>
              </div>
              <!-- /.box-body -->

                        
              <div class="box-footer" style="margin-left: 80px">                
                  <input type="submit" value="Guardar" class="btn btn-primary" />
                  
                  &nbsp;&nbsp;
                  <a href="${pageContext.request.contextPath}/salas" class="btn btn-primary">Cancelar</a> 
              </div>
              
    </frm:form>
</div>

</section> 
</div>
