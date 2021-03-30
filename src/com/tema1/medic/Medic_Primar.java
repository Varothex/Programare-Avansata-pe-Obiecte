package com.tema1.medic;

public class Medic_Primar extends Medic
{
    static final int bonus = 2;

    public Medic_Primar(String nume, String cabinet, double salariu)
    {
        super(nume, cabinet, salariu);
    }

    @Override
    public double salariu()
    {
        return salariu * bonus;
    }
}