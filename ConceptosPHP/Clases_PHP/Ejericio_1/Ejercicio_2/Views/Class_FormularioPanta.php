<?php
class FormularioPlanta
{
    public function mostrar()
    {
        // Usamos HEREDOC para generar el HTML de manera más legible
        $html = <<<EOT
<div class="container-fluid well">
    <div class="row clearfix">
        <form role="form" class="form-horizontal" action="../Controllers/LiquidarEmpleado.php" >
            
            <!-- Campo Identificación -->
            <div class="form-group">
                <label class="col-sm-3 control-label">Identificación</label>
                <div class="col-sm-6">
                    <input type="hidden" name="tipo_empleado" value="1">
                    <input type="text" class="form-control" name="identificacion" id="identificacion" placeholder="Identificación...">
                </div>
            </div>

            <!-- Campo Nombre -->
            <div class="form-group">
                <label class="col-sm-3 control-label">Nombre</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" name="nombre" id="nombre" placeholder="Nombre...">
                </div>
            </div>

            <!-- Campo Cargo -->
            <div class="form-group">
                <label class="col-sm-3 control-label">Cargo</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" name="cargo" id="cargo" placeholder="Cargo...">
                </div>
            </div>

            <!-- Campo Sueldo Básico -->
            <div class="form-group">
                <label class="col-sm-3 control-label">Sueldo básico</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" name="sueldo_basico" id="sueldo_basico" placeholder="Sueldo básico...">
                </div>
            </div>

            <!-- Campo Valor Extras -->
            <div class="form-group">
                <label class="col-sm-3 control-label">Valor extras</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" name="valor_extras" id="valor_extras" placeholder="Valor extras...">
                </div>
            </div>

            <!-- Campo Deducciones -->
            <div class="form-group">
                <label class="col-sm-3 control-label">Deducciones</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" name="deducciones" id="deducciones" placeholder="Deducciones...">
                </div>
            </div>

            <!-- Botón de Envío -->
            <div class="form-group">
                <div class="col-sm-4 col-sm-offset-3">
                    <input type="submit" class="btn btn-info" value="Procesar">
                </div>
            </div>

        </form>
    </div>
</div>
EOT;

        // Mostramos el HTML generado
        echo $html;
    }
}
