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
    <c:url var="urlsave" value="${pageContext.request.contextPath}/guardar-merienda" />
    <frm:form modelAttribute="modeloMerienda" method="POST" action="${urlsave}" class="form-horizontal" >
        
             <div class="box-body">
                <div class="form-group">
                    <frm:hidden path="idMerienda" />
                    <frm:label path="nombre" class="col-sm-2 control-label" >Nombre</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="nombre" class="form-control" />
                    </div>
                </div>
                <div class="form-group">                    
                    <frm:label path="descripcion" class="col-sm-2 control-label" >Descripción</frm:label>
                    <div class="col-sm-10">
                    <frm:textarea path="descripcion" class="form-control" rows="5" cols="50"/>
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="imagenRuta" class="col-sm-2 control-label" >Imagen (URL)</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="imagenRuta" class="form-control" />
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="idTmerienda.idTmerienda" class="col-sm-2 control-label" >Tipo</frm:label>
                    <div class="col-sm-10">
                    <frm:select path="idTmerienda.idTmerienda" class="form-control">
                        <frm:options items="${listTmerienda}" itemLabel="nombre" itemValue="idTmerienda" />
                    </frm:select>
                    </div>
                </div>
              </div>
              <!-- /.box-body -->

                        
              <div class="box-footer" style="margin-left: 80px">                
                  <input type="submit" value="Guardar" class="btn btn-primary" />
                  
                  &nbsp;&nbsp;
                  <a href="${pageContext.request.contextPath}/meriendas" class="btn btn-primary">Cancelar</a> 
              </div>
              
    </frm:form>
</div>

</section> 
</div> 

