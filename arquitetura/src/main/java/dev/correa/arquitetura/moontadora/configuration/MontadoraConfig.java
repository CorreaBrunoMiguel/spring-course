package dev.correa.arquitetura.moontadora.configuration;

import dev.correa.arquitetura.moontadora.Motor;
import dev.correa.arquitetura.moontadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static dev.correa.arquitetura.moontadora.TipoMotor.ASPIRADO;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 06/01/2025
 **/

@Configuration
public class MontadoraConfig {
	
	@Bean
	public Motor motor(){
		var motor = new Motor();
		motor.setCavalos(120);
		motor.setCilindros(4);
		motor.setModelo("BMC-86||39");
		motor.setLitragem(2.6);
		motor.setTipoMotor(ASPIRADO);
		return motor;
	}
}
