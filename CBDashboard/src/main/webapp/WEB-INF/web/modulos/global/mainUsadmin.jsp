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
            <form action="${pageContext.request.contextPath}/buscar-usadmin" method="POST">

            <div class="form-group">
                <label class="col-sm-2 control-label">Nombre</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control"  id="dato" name="dato"/>                     
                </div>                
                <div class="col-sm-1">
                    <input type="submit" value="Buscar" class="btn btn-primary"/>
                </div>
                <div class="col-sm-1">
                    <a class="btn btn-info" href="${pageContext.request.contextPath}/formulario-usadmin">Nuevo</a>
                </div>
            </div>
              </form>
          </div>
          </div> 
                
                
                
    <c:if test="${!empty listUsadmin}">
        <div class="box">
                <div class="box-header">
                    <h3 class="box-title">Reporte de Películas</h3>                                    
                </div><!-- /.box-header -->        
        <div class="box-body table-responsive">
        <table id="example1" class="table table-bordered table-striped">
          <thead >
            <tr>
              <th >#</th>                           
              <th >Codigo</th>                           
              <th >Nombre</th>
              <th >Email</th>
              <th >Celular</th>
              <th >Sucursal</th>
            </tr>
          </thead>
          <tbody>
              <c:forEach items="${listUsadmin}" var="dato" varStatus="loop">
                      <tr>
                        <th>${loop.count}</th>
                        <td>${dato.codigo}</td>
                        <td>${dato.nombre} ${dato.apPaterno}</td>
                        <td>${dato.email}</td>
                        <td>${dato.ncelular}</td>
                        <td>${dato.idSucursal.nombre}</td>
                        <td align="center">
                            <a href="${pageContext.request.contextPath}/eliminar-usadmin?id=${dato.idUsadmin}" ><span title="Eliminar" class="glyphicon glyphicon-remove"></span></a>
                            <a href="${pageContext.request.contextPath}/editar-usadmin?id=${dato.idUsadmin}" ><span title="Editar" class="glyphicon glyphicon-edit"></span></a>
                        
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
