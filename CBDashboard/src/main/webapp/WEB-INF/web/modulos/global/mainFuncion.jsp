<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script src='/webjars/AdminLTE/2.4.2/bower_components/jquery/dist/jquery.min.js'></script>
<link rel="stylesheet" href="/resources/css/jquery.dataTables.min.css">
<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
    <section class="content-header">

    </section>    
    <section class="content">
        
      <div class="box">
          <div class="box-body">
            <form action="${pageContext.request.contextPath}/buscar-funcion" method="POST">

            <div class="form-group">
                <label class="col-sm-2 control-label">Nombre</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control"  id="dato" name="dato"/>                     
                </div>                
                <div class="col-sm-1">
                    <input type="submit" value="Buscar" class="btn btn-primary"/>
                </div>
                <div class="col-sm-1">
                    <a class="btn btn-info" href="${pageContext.request.contextPath}/formulario-funcion">Nuevo</a>
                </div>
            </div>
              </form>
          </div>
          </div> 
                
                
                
    <c:if test="${!empty listFuncion}">
        <div class="box">
                <div class="box-header">
                    <h3 class="box-title">Reporte de Funciones</h3>                                    
                </div><!-- /.box-header -->        
        <div class="box-body table-responsive">
        <table id="example1" class="table table-bordered table-striped">
          <thead >
            <tr>
              <th >#</th>                           
              <th >Fecha</th>
              <th >Hora</th>             
              <th >Película</th>
              <th >Calidad</th>
              <th >Idioma</th>
              <th >Sala</th>              
            </tr>
          </thead>
          <tbody>
              <c:forEach items="${listFuncion}" var="dato" varStatus="loop">
                      <tr>
                        <th>${loop.count}</th>
                        <td>${dato.fecha}</td>
                        <td>${dato.hora}</td>
                        <td>${dato.idPelicula.titulo}</td>
                        <td>${dato.idFormato.nombre}</td>
                        <td>${dato.idioma}</td>
                        <td>Sala ${dato.idSala.numero}</td>
                        <td align="center">
                            <a href="${pageContext.request.contextPath}/eliminar-funcion?id=${dato.idFuncion}" ><span title="Eliminar" class="glyphicon glyphicon-remove"></span></a>
                            <a href="${pageContext.request.contextPath}/editar-funcion?id=${dato.idFuncion}" ><span title="Editar" class="glyphicon glyphicon-edit"></span></a>
                        
                        </td>
                      </tr>
              </c:forEach> 
            </tbody>           
          </table>  
          </div>
        </div>                                
    </c:if>         
        
    </section>

</div>
