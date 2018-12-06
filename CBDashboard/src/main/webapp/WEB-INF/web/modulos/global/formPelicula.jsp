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
    <c:url var="urlsave" value="${pageContext.request.contextPath}/guardar-pelicula" />
    <frm:form modelAttribute="modeloPelicula" method="POST" action="${urlsave}" class="form-horizontal" >
        
             <div class="box-body">
                <div class="form-group">
                    <frm:hidden path="idPelicula" />
                    <frm:label path="titulo" class="col-sm-2 control-label" >Titulo</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="titulo" class="form-control" />
                    </div>
                </div>
                <div class="form-group">                    
                    <frm:label path="codigo" class="col-sm-2 control-label" >Código</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="codigo" class="form-control" />
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="duracion" class="col-sm-2 control-label" >Duración</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="duracion" class="form-control" type="number" min="30" max="200" step="10"/>
                    minutos
                    </div>
                </div>
                <div class="form-group" >
                    <frm:label path="director" class="col-sm-2 control-label" >Director</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="director" class="form-control" />
                    </div>
                </div>
                <div class="form-group" >
                    <frm:label path="sinopsis" class="col-sm-2 control-label" >Sinopsis</frm:label>
                    <div class="col-sm-10">
                    <frm:textarea path="sinopsis" class="form-control" rows="5" cols="50"/>
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="imagenRuta" class="col-sm-2 control-label" >Imagen (URL)</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="imagenRuta" class="form-control" />
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="reparto" class="col-sm-2 control-label" >Reparto</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="reparto" class="form-control" />
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="idGenero.idGenero" class="col-sm-2 control-label" >Género</frm:label>
                    <div class="col-sm-10">
                    <frm:select path="idGenero.idGenero" class="form-control">
                        <frm:options items="${listGenero}" itemLabel="nombre" itemValue="idGenero" />
                    </frm:select>
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="idCategoria.idCategoria" class="col-sm-2 control-label" >Categoría</frm:label>
                    <div class="col-sm-10">
                    <frm:select path="idCategoria.idCategoria" class="form-control">
                        <frm:options items="${listCategoria}" itemLabel="nombre" itemValue="idCategoria" />
                    </frm:select>
                    </div>
                </div>
              </div>
              <!-- /.box-body -->

                        
              <div class="box-footer" style="margin-left: 80px">                
                  <input type="submit" value="Guardar" class="btn btn-primary" />
                  
                  &nbsp;&nbsp;
                  <a href="${pageContext.request.contextPath}/peliculas" class="btn btn-primary">Cancelar</a> 
              </div>
              
    </frm:form>
</div>

</section> 
</div> 
