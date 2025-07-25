/*
 * Copyright (C) 2020 
 * Authors: Ricardo Arguello, Misael Fernández
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.*
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package ec.gob.firmadigital.libreria.certificate.ec.anfac;

import java.security.cert.X509Certificate;

import ec.gob.firmadigital.libreria.certificate.ec.CertificadoPersonaJuridica;

/**
 * Certificado de Persona Juridica por emitido por ANf AC Ecuador
 *
 * @author mfernandez
 */
public class CertificadoPersonaJuridicaAnfAc18332 extends CertificadoAnfAc18332
        implements CertificadoPersonaJuridica {

    public CertificadoPersonaJuridicaAnfAc18332(X509Certificate certificado) {
        super(certificado);
    }
}
