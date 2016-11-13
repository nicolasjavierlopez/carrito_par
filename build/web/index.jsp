<%-- 
    Document   : index
    Created on : 09/11/2016, 06:58:48 PM
    Author     : lopez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap theme -->
        <link href="css/estilos.css" rel="stylesheet">
        <title>Carrito Online</title>
    </head>
    <body>
        <div class="panel panel-default col-md-3">
            <div class="panel-body">
                <section class="form">
                    <div class="form-group">
                        <label for="usuario">Nombre Usuario :</label>
                        <input type="text" name="usuario" id="usuario" class="form-control">
                        <span class="help-block">Nombre del usuario.</span>
                    </div>
                    <div class="form-group">
                        <label for="Password">Password :</label>
                        <input type="password" name="password" id="password" class="form-control">
                        <span class="help-block">Correo del nuevo contacto.</span>
                    </div>
                </section>
            </div>
            <div class="panel-footer">
                <a class="btn btn-default" id="guardar" role="button">
                    <i class="glyphicon glyphicon-floppy-disk"></i> &nbsp;Guardar
                </a>
            </div>
        </div>
    </body>
</html>
