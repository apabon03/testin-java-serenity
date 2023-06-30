#language: es
  Característica: Login de usuario
    Yo como usuario quiero logearme en la pagina demo serenity
    para ingresar a la dashboard.
  Escenario: Loguear usuario de forma exitosa
    Dado que el usuario abre la pagina demo serenity.
    Cuando el usuario modifique las credenciales de ingreso y haga click en ingresar
    Entonces el usuario puede visualizar el mensaje dashboard