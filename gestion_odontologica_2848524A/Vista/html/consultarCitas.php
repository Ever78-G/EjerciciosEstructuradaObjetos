<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Consultar Citas</title>
</head>

<body>
    <?php
    // Aquí deberías ejecutar la consulta SQL para obtener las citas. Ejemplo:
    $sql = "SELECT CitNumero, CitFecha, CitHora FROM citas WHERE PacienteId = 'PacIdentificacion'";

    // Verificar si hay resultados
    if ($result->num_rows > 0) {
    ?>
        <table border="1">
            <tr>
                <th>Número</th>
                <th>Fecha</th>
                <th>Hora</th>
            </tr>
            <?php
            // Recorrer y mostrar las citas
            while ($fila = $result->fetch_object()) {
            ?>
                <tr>
                    <td><?php echo $fila->CitNumero; ?></td>
                    <td><?php echo $fila->CitFecha; ?></td>
                    <td><?php echo $fila->CitHora; ?></td>
                </tr>
            <?php
            }
            ?>
        </table>
    <?php
    } else {
    ?>
        <p>No hay citas disponibles.</p>
    <?php
    }
    ?>
</body>

</html>