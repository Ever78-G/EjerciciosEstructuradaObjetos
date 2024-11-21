<?php
include "Class_Persona.php";

class Estudiante extends Persona{
    protected $curso;
    public function __construct($nombre, $curso, $identificacion,$fechanacimiento)
    {
        parent::__construct($nombre,$identificacion,$fechanacimiento);
        $this->curso=$curso;
        
    }

    public function getcurso(){
        return $this->curso;
    }
    public function setcurso($valor){
        $this->curso=$valor;

    }
}


?>