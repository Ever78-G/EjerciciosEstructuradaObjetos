<?php

include "conexionDB.php";

if ($resultado = $conexion->query("select id, nombre from cuidad;")) {

    while ($registro = $resultado->fetch_assoc()) {
        echo $registro["id"] . " " . $registro["nombre"] . "<br/>";

    }
    
}

$resultado->free();
$conexion->close();
?>