<?php

class Persona{
    private $identificacion;
    private $nombre;
    private $fechanacimiento;

    public function __construct($nombre, $identificacion,$fechanacimiento)
    {   
        $this->nombre=$nombre;
        $this->identificacion=$identificacion;
        $this->fechanacimiento=$fechanacimiento;
    }
    public function getnombre(){
        return $this->nombre;
    }
    public function setnombre($valor){
        $this->nombre=$valor;

    }
    public function getidentificacion(){
        return $this->identificacion;
    }
    public function setidentificacion($valor){
        $this->identificacion=$valor;
    }

    public function getfechanacimiento(){
        return $this->fechanacimiento;
    }
    public function setfechanamiento($valor){
        $this->fechanacimiento=$valor;
    }
}


?>