# ProyectoTiendaV2

## Proyecto COD + PROG 3a EV

La idea del proyecto es crear una aplicación de una tienda en la cual los usuarios podrán navegar entre los diferentes productos disponibles para su futura compra. La aplicación en un principio dispondrá de las siguientes opciones:

### Usuarios:

  - Opción de navegar por la aplicación **sin cuenta** y por ende sin la posibilidad de comprar productos.
  - Posibilidad de **crear** una cuenta propia.
  - Posibilidad de **iniciar sesión** una vez creada su cuenta para poder **comprar** los diferentes productos del catálogo.
  - Poder seleccionar entre diferentes **métodos de pago** a la hora de comprar un producto.

### Administradores:

  - Posibilidad de **crear**, **editar** o **eliminar** productos del catálogo.
  - Capacidad de **eliminar** o **crear** nuevos usuarios.

### Extras:

  - **Cifrado hash** de la base de datos.
  - **Interfaz gráfica** para que el usuario pueda navegar de forma amigable por el entorno de la página web.
  - **Saludo** personalizado al usuario dependiendo de su nombre de usuario.
  - Posibilidad de **imprimir** un **ticket de compra** una vez realizado un pedido.
  - Posibilidad de desplegar el proyecto en **Web**.

### Diagrama de clases:

```mermaid
classDiagram
  direction RL

  class Controlador {
    + irRegistro()
    + irPerfil()
    + irLogin()
    + LoginCns()
    + volverCa()
  }

  class CifradoHash {
    + getHash(txt, hashType)
    + md5(txt)
    + sha1(txt)
  }

  class Conexion {
    // atributos y métodos de la clase Conexion
  }

  class Metodos {
    // atributos y métodos de la clase Metodos
  }

  class Usuario {
    - Nombre
    - Apellidos
    - Contraseña
    - Correo
  }

  class Productos {
    // atributos y métodos de la clase Productos
  }

  class CatalogoEstilo {
    // atributos y métodos de la clase CatalogoEstilo
  }

  class CatalogoEstilo2 {
    // atributos y métodos de la clase CatalogoEstilo2
  }

  class CatalogoNoSesion {
    // atributos y métodos de la clase CatalogoNoSesion
  }

  class CatalogoNoSesion2 {
    // atributos y métodos de la clase CatalogoNoSesion2
  }

  class Direccion {
    // atributos y métodos de la clase Direccion
  }

  class Completado {
    // atributos y métodos de la clase Completado
  }

  class Paypal {
    // atributos y métodos de la clase Paypal
  }

  class Tarjeta {
    // atributos y métodos de la clase Tarjeta
  }

  class Login {
    + btnLogin
    + IrRegistrarse
    + logNombre
    + logContraseña
  }

  class Perfil {
    + volverCatalogo()
  }

  Controlador --|> CatalogoEstilo
  Controlador --|> Login
  Controlador --|> Perfil
  Conexion --|> Controlador
  CifradoHash --|> Controlador
  Metodos --|> Controlador
  Usuario --|> Controlador
  Productos --|> Controlador
  CatalogoEstilo2 --|> Controlador
  CatalogoNoSesion --|> Controlador
  CatalogoNoSesion2 --|> Controlador
  Direccion --|> Controlador
  Completado --|> Controlador
  Paypal --|> Controlador
  Tarjeta --|> Controlador
```

### Diagrama de secuencia:

```mermaid
sequenceDiagram
    participant Main
```

Muchas gracias por el tiempo que has empleado leyendo esta breve introducción a nuestro proyecto, si deseas ver más informacióna acerca de lo que fue el desarrollo de todo el proyecto puedes acceder a ella desde nuestra página de [Wiki](https://github.com/PachecoASIR/ProyectoTiendaV2/wiki).

### Participantes en el desarrollo del proyecto:

Autor: @PachecoASIR

Colaboradores: @FranciscoFerreiraT
