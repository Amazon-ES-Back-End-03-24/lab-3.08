# LAB | Java Modelado de relaciones complejas

## Introducción

Acabamos de aprender cómo usar el Mapeo de Relaciones para modelar relaciones 1 a 1 y relaciones 1 a muchos, así que practiquemos un poco más.

<br>

## Requisitos

1. Haz un fork de este repositorio.
2. Clona este repositorio.
3. Añade a tu instructor y a los calificadores de la clase como colaboradores de tu repositorio. Si no estás seguro de quiénes son los calificadores de tu clase, pregunta a tu instructor o consulta la presentación del primer día.
4. En el repositorio, crea un proyecto de Java y añade el código para las siguientes tareas.

## Entrega

Una vez que termines la tarea, envía un enlace URL a tu repositorio o tu solicitud de extracción en el campo de abajo.

<br>

## Instrucciones

1. Utilizando el modelo Spring JPA, crea las relaciones para una aplicación para una Asociación de Enfermeras. La Asociación tiene 7 divisiones y cada

- División tiene las siguientes propiedades:
    - `name`: el nombre de la división
    - `district`: el distrito geográfico al que pertenece la división
    - `president`: un objeto Miembro que representa el presidente de la división
    - `list`: una lista de objetos Miembro que representan a los miembros de la división

- Cada Miembro tiene las siguientes propiedades:

    - `name`: el nombre del miembro
    - `status`: el estatus del miembro, que puede ser _ACTIVE_ or _LAPSED_ (ACTIVO o LAPSADO)
    - `renewal date`: la fecha en que se renovará la membresía del miembro

2. Utilizando el modelo Spring JPA, crear las relaciones para una aplicación de Gestión de Eventos. La aplicación necesita modelar eventos próximos, que pueden ser de dos tipos: Conferencias o Exposiciones.

- Cada evento tiene las siguientes propiedades:

    - `date`: la fecha en que se llevará a cabo el evento
    - `duration`: la duración del evento
    - `location`: la ubicación del evento
    - `title`: el título del evento
    - `list`: una lista de invitados a los que se les ha invitado al evento.

- Cada invitado tiene las siguientes propiedades:

    - `name`: el nombre del invitado
    - `status`: la respuesta del invitado, que puede ser _ATTENDING_, _NOT_ATTENDING_, or _NO_RESPONSE_ (ASISTIENDO, NO ASISTIENDO, o SIN RESPUESTA)

Además de las propiedades típicas de eventos, las Conferencias también tienen una lista de Oradores.

- Cada Orador tiene las siguientes propiedades:

- `name`: el nombre del orador
- `presentationDuration`: la duración de la presentación.

<br>