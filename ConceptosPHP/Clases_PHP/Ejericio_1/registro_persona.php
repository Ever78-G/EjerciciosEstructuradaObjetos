<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario Persona</title>
</head>

<body>

    <form action="" method="POST">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required>
        <br>

        <label for="identificacion">Identificación:</label>
        <input type="text" id="identificacion" name="identificacion" required>
        <br>

        <label for="fecha">Fecha:</label>
        <input type="text" id="fecha" name="fecha" required>
        <br>

        <button type="submit">Enviar</button>
    </form>

    <?php
    include "Class_Persona.php";

    if (
        $_SERVER['REQUEST_METHOD'] === 'POST' &&
        !empty($_POST['nombre']) &&
        !empty($_POST['identificacion']) &&
        !empty($_POST['fecha'])
    ) {

        // Recoger los datos enviados y sanitizarlos
        $nombre = htmlspecialchars($_POST['nombre']);
        $identificacion = htmlspecialchars($_POST['identificacion']);
        $fecha = htmlspecialchars($_POST['fecha']);

        $objpersona = new Persona($nombre, $identificacion, $fecha);

        echo "<p>Nombre ingresado: " . $objpersona->getnombre() . "</p>";
        echo "<p>Identificación: " . $identificacion . "</p>";
        echo "<p>Fecha: " . $fecha . "</p>";
    } else {
        echo "<p>Por favor, completa todos los campos.</p>";
    }
    ?>

</body>

</html>