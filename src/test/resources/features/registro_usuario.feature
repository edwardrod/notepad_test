#Autor: Eduar Rodriguez
  @stories

  Feature: realizar unas notas en la pagina nodepad


    @scenario1
    Scenario: Crear una nota de texto enriquecido con letra en negrita
      Given Eduar ingresa a notepad
      When El usuario ingresa la nota en negrita
        | strNota | strNombreNota|
        | Cuando el analista de talento humano te contacta para programar la entrevista te envía un instructivo con los instaladores y configuraciones necesarios para comenzar la prueba. De no tener este paso listo se recomienda solicitarlo al guía de entrevista a la brevedad.| Nota negrita|
      Then Creacion completa de la nota