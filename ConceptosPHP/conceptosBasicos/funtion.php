<?php
function dia_semena($dia){
    switch ($dia) {
        case 1:
            return "Lunes";
        case 2:
            return "Martes";
        case 3:
            return "Miercoles";
        case 4:
            return "Jueves";
        case 5:
            return "Viernes";
    
}
}
echo dia_semena(4);

?>