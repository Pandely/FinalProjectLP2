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
    <c:url var="urlsave" value="${pageContext.request.contextPath}/guardar-usadmin" />
    <frm:form modelAttribute="modeloUsadmin" method="POST" action="${urlsave}" class="form-horizontal" >
        
             <div class="box-body">
                <div class="form-group">
                    <frm:hidden path="idUsadmin" />
                    <frm:label path="codigo" class="col-sm-2 control-label" >Código</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="codigo" class="form-control" />
                    </div>
                </div>
                <div class="form-group">                    
                    <frm:label path="nombre" class="col-sm-2 control-label" >Nombre</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="nombre" class="form-control" />
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="apPaterno" class="col-sm-2 control-label" >Apellido Paterno</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="apPaterno" class="form-control" />
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="apMaterno" class="col-sm-2 control-label" >Apellido Materno</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="apMaterno" class="form-control" />
                    </div>
                </div>
                <div class="form-group" >
                    <frm:label path="genero" class="col-sm-2 control-label" >Género</frm:label>
                    <div class="col-sm-10">                    
                    <frm:select path="genero" class="form-control">                        
                        <frm:option value="M">Masculino</frm:option>
                        <frm:option value="F">Femenino</frm:option>
                    </frm:select>
                    </div>
                </div>
                <div class="form-group" >
                    <frm:label path="ncelular" class="col-sm-2 control-label" >Celular</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="ncelular" class="form-control"/>
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="fechaNac" class="col-sm-2 control-label" >Fecha de nacimiento</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="fechaNac" class="form-control" type="date"/>
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="dni" class="col-sm-2 control-label" >DNI</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="dni" class="form-control" />
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="direccion" class="col-sm-2 control-label" >Dirección</frm:label>
                    <div class="col-sm-10">
                    <frm:textarea path="direccion" class="form-control" rows="2" cols="50"/>
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="email" class="col-sm-2 control-label" >Email</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="email" class="form-control" />
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="password" class="col-sm-2 control-label" >Contraseña</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="password" class="form-control" />
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="idSucursal.idSucursal" class="col-sm-2 control-label" >Sucursal</frm:label>
                    <div class="col-sm-10">
                    <frm:select path="idSucursal.idSucursal" class="form-control">
                    <frm:options items="${listSucursal}" itemLabel="nombre" itemValue="idSucursal" />
                    </frm:select>
                    </div>
                    <frm:hidden path="idPerfil" value="2"/>
                </div>
              </div>
              <!-- /.box-body -->

                        
              <div class="box-footer" style="margin-left: 80px">                
                  <input type="submit" value="Guardar" class="btn btn-primary" />
                  
                  &nbsp;&nbsp;
                  <a href="${pageContext.request.contextPath}/usadmins" class="btn btn-primary">Cancelar</a> 
              </div>
              
    </frm:form>
</div>

</section> 
</div> 

