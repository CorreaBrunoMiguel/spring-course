package dev.correa.arquitetura.moontadora;

import java.awt.*;

import static dev.correa.arquitetura.moontadora.Montadora.HONDA;
import static java.awt.Color.BLACK;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 06/01/2025
 **/

public class HondaHRV extends Carro {
	public HondaHRV (Motor motor) {
		super(motor);
        setModelo("HRV");
        setColor(BLACK);
        setMontadora(HONDA);
	}
}
