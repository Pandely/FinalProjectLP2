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
    <c:url var="urlsave" value="${pageContext.request.contextPath}/guardar-sucursal" />
    <frm:form modelAttribute="modeloSucursal" method="POST" action="${urlsave}" class="form-horizontal" >
        
             <div class="box-body">
                <div class="form-group">
                    <frm:hidden path="idSucursal" />
                    <frm:label path="nombre" class="col-sm-2 control-label" >Nombre</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="nombre" class="form-control" />
                    </div>
                </div>
                <div class="form-group">                    
                    <frm:label path="direccion" class="col-sm-2 control-label" >Dirección</frm:label>
                    <div class="col-sm-10">
                    <frm:textarea path="direccion" class="form-control" rows="2" cols="50"/>
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="idCiudad.idCiudad" class="col-sm-2 control-label" >Ciudad</frm:label>
                    <div class="col-sm-10">
                    <frm:select path="idCiudad.idCiudad" class="form-control">
                    <frm:options items="${listCiudad}" itemLabel="nombre" itemValue="idCiudad" />
                    </frm:select>
                    minutos
                    </div>
                </div>                
              </div>
              <!-- /.box-body -->

                        
              <div class="box-footer" style="margin-left: 80px">                
                  <input type="submit" value="Guardar" class="btn btn-primary" />
                  
                  &nbsp;&nbsp;
                  <a href="${pageContext.request.contextPath}/sucursales" class="btn btn-primary">Cancelar</a> 
              </div>
              
    </frm:form>
</div>

</section> 
</div> 

