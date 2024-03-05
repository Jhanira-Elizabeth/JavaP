/*
 * Copyright [2024] [Yo]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        String cadena1 = "Hola";
        String cadena2 = "Hola";
        if (cadena1.equals(cadena2)) {
            logger.info("Las cadenas son iguales");
        }
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\arand\\Documents\\U\\ProgramacionAvanzada\\U3\\Lab2\\Proyecto\\Java\\archivo.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                logger.info(line);
            }
        } catch (IOException e) {
            logger.error("Error de E/S:", e);
        }

    }
}
