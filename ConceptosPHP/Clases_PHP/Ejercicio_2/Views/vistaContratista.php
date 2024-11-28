<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/
bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<?php
include "../Model/Class_Empleado.php";
include "../Model/Class_Contratista.php";
include "../Model/Class_Planta.php";
require_once('../Views/Class_FormularioContratista.php');  // Asegúrate de que esta línea esté antes de usar la clase
$formulario = new FormularioContratista();
$formulario->mostrar();
?>
</body>
</html>