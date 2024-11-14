<?php
    include "conexionDB.php";

    $sql= $conexion->query("SELECT * FROM mercado;");

    if($sql== true){
        echo $sql->num_rows ;
    }
    else{
        echo "Algo salio mal ";
    }

?>