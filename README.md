# Descripción del Proyecto
La Calculadora de Impuestos para Vehículos es una aplicación de escritorio desarrollada en Java que permite a los usuarios calcular el valor de los impuestos de sus vehículos.

La aplicación implementa el patrón de diseño Modelo-Vista-Controlador (MVC) para mantener una estructura organizada y modular del código.

# Características

- Cálculo Automático: Determina el impuesto basado en factores como el avalúo comercial, año de fabricación, cilindraje y tipo de uso del vehículo.
- Interfaz Gráfica Intuitiva: Diseñada con Java Swing para facilitar la entrada de datos y visualización de resultados.
- Tarifas Actualizadas: Incorpora las tasas vigentes según las regulaciones actuales.
- Procesamiento de Descuentos: Aplica automáticamente descuentos por antigüedad y tipo de uso.

# Estructura del Proyecto (MVC)

# Modelo

- ImpuestosModelo.java: Contiene la lógica de negocio para el cálculo de impuestos.

# Vista

- ImpuestosVista.java: Interfaz gráfica desarrollada con Swing que permite la entrada de datos y muestra los resultados.

# Controlador

- ImpuestosControlador.java: Maneja la interacción entre la vista y el modelo, respondiendo a eventos del usuario.

# Principal

- Main.java: Punto de entrada de la aplicación que inicializa los componentes MVC.

# Lógica de Cálculo de Impuestos
El impuesto se calcula considerando los siguientes factores:

# Avalúo Comercial:

- Hasta 54,057,000: 1.5% del avalúo
- Entre 54,057,000 y 121,625,000: 2.5% del avalúo
- Más de 121,625,000: 3.5% del avalúo

# Tipo de Uso:

- Particular: Sin cambios
- Público: 20% de descuento

# Antigüedad:

- Vehículos con más de 10 años: 20% de descuento

# Cilindraje:

- Vehículos con cilindraje superior a 2000cc: Incremento de 500 unidades monetarias

  # Requisitos

- Java 8 o superior (Eclipse, NetBeans, IntelliJ IDEA)

  # Instalación y Ejecución

- Clonar el repositorio:
    git clone https://github.com/jeissonsierra1/CalculadoraImpuestosCarro.git
    cd calculadora-impuestos-vehiculos
- Ejecutar la aplicación: Desde un IDE, ejecute la clase Main.java.

# Estructura de Directorios

calculadora-impuestos-vehiculos/
│
├── src/
│   ├── principal/
│   │   └── Main.java
│   │
│   ├── modelo/
│   │   └── ImpuestosModelo.java
│   │
│   ├── vista/
│   │   └── ImpuestosVista.java
│   │
│   └── controlador/
│       └── ImpuestosControlador.java
│
└── README.md

# Uso de la Aplicación
1. Complete los campos solicitados en la interfaz:

- Marca y modelo del vehículo
- Año de fabricación
- Cilindraje
- Avalúo comercial
- Tipo de uso (particular o público)

2. Haga clic en el botón "Calcular" para obtener el valor del impuesto.
3. El resultado se mostrará en la parte inferior de la ventana.


















