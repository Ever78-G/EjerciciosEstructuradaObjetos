<?php

$conexion = new mysqli("localhost", "root", "", "jueves");

if ($conexion->connect_errno) {
    echo "Falla al conectarse a Mysql";
} else {
    echo $conexion->host_info;
}
;
?>