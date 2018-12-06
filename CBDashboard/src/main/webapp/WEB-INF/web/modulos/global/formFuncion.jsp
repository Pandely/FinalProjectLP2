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
    <c:url var="urlsave" value="${pageContext.request.contextPath}/guardar-funcion" />
    <frm:form modelAttribute="modeloFuncion" method="POST" action="${urlsave}" class="form-horizontal" >
        
             <div class="box-body">
                <div class="form-group">
                    <frm:hidden path="idFuncion" />
                    <frm:label path="fecha" class="col-sm-2 control-label" >Fecha</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="fecha" class="form-control" type="date" />
                    </div>
                </div>
                <div class="form-group">                    
                    <frm:label path="hora" class="col-sm-2 control-label" >Hora</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="hoea" class="form-control" type="time" />
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="idPelicula.idPelicula" class="col-sm-2 control-label" >Película</frm:label>
                    <div class="col-sm-10">
                    <frm:select path="idPelicula.idPelicula" class="form-control">
                        <frm:options items="${listPelicula}" itemLabel="titulo" itemValue="idPelicula" />
                    </frm:select>
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="idFormato.idFormato" class="col-sm-2 control-label" >Calidad</frm:label>
                    <div class="col-sm-10">
                    <frm:select path="idFormato.idFormato" class="form-control">
                        <frm:options items="${listFormato}" itemLabel="nombre" itemValue="idFormato" />
                    </frm:select>
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="idioma" class="col-sm-2 control-label" >Idioma</frm:label>
                    <div class="col-sm-10">
                    <frm:select path="idioma" class="form-control">                        
                        <frm:option value="DOB">Doblado</frm:option>
                        <frm:option value="SUB">Subtitulado</frm:option>
                    </frm:select>
                    </div>
                </div>
                <div class="form-group" >
                    <frm:label path="idSala.idSala" class="col-sm-2 control-label" >Sala</frm:label>
                    <div class="col-sm-10">
                    <frm:select path="idSala.idSala" class="form-control">
                        <frm:options items="${listSala}" itemLabel="numero" itemValue="idSala" />
                    </frm:select>
                    </div>
                    <frm:hidden path="idSucursal.idSucursal" value="${1}"/>
                </div>
              </div>
              <!-- /.box-body -->

                        
              <div class="box-footer" style="margin-left: 80px">                
                  <input type="submit" value="Guardar" class="btn btn-primary" />
                  
                  &nbsp;&nbsp;
                  <a href="${pageContext.request.contextPath}/funciones" class="btn btn-primary">Cancelar</a> 
              </div>
              
    </frm:form>
</div>

</section> 
</div> 
