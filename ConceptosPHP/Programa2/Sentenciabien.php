<?php
    include "conexionDB.php";

    $sql= $conexion->query("SELECT * FROM cuidad;");

    if($sql== true){
        $resultado=$sql;
        echo  ("La consulta devolvió". $resultado->num_rows . "registros");
    }
    else{
        echo "Algo salio mal ";
    }

?>