# language: es
Característica: Autenticación E2E en sitio público QA The Internet
  Como QA Automation Engineer
  Quiero validar el flujo de autenticación de extremo a extremo
  Para evidenciar una automatización funcional con datos parametrizados en JSON

  @e2e @login @smoke
  Escenario: Login exitoso con credenciales válidas
    Dado que Rodrigo abre el portal de autenticación QA
    Cuando inicia sesión usando el perfil "valid_user"
    Entonces debe visualizar el mensaje esperado para el perfil "valid_user"
    Y debe quedar autenticado en el área segura

  @e2e @login @negative
  Esquema del escenario: Validación de errores de autenticación
    Dado que Rodrigo abre el portal de autenticación QA
    Cuando inicia sesión usando el perfil "<perfil>"
    Entonces debe visualizar el mensaje esperado para el perfil "<perfil>"

    Ejemplos:
      | perfil           |
      | invalid_password |
      | invalid_user     |
