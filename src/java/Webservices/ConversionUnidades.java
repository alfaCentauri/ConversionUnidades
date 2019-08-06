/*
 * Copyright (C) 2019 Ingeniero en Computación: Ricardo Presilla.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 * Servicio web para la conversión de unidades de distancia.
 * @author Ingeniero en Computación: Ricardo Presilla.
 * @version 1.0.
 */
@WebService(serviceName = "ConversionUnidades")
public class ConversionUnidades {

    /**
     * Web service para convertir pulgadas a centimetros.
     * @param pulgadas
     * @return Regresa un double con los centimetros.
     */
    @WebMethod(operationName = "pulgadasACentimetros")
    public double pulgadasACentimetros(@WebParam(name = "pulgadas") double pulgadas) {
        return pulgadas*2.54;
    }

    /**
     * Web service para convertir centimetros a pulgadas.
     * @param centimetros
     * @return Regresa un double con las pulgadas.
     */
    @WebMethod(operationName = "centimetrosAPulgadas")
    public double centimetrosAPulgadas(@WebParam(name = "centimetros") double centimetros) {
        return centimetros/2.54;
    }
}
