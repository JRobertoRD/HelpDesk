/**
 * 
 */
 
     // La siguiente funcion valida el elemento input
    function validarNombre() {
		
      // Variable que usaremos para determinar si el input es valido
      let isValid = false;

      // El input que queremos validar
      const inputN = document.getElementById("nombre");
      
      const btn = document.getElementById("botonRegistrar");

      //El div con el mensaje de advertencia:
      const messageN = document.getElementById('messageNombre');

      inputN.willValidate = false;

      // El tamaño maximo para nuestro input
      const maximo = 35;

      // El pattern que vamos a comprobar
      const pattern = new RegExp('^[A-Z]+$', 'i');

      // Primera validacion, si input esta vacio entonces no es valido
      if(!inputN.value) {
      	
        isValid = false;
      } else {
        // Segunda validacion, si input es mayor que 35
        if(inputN.value.length > maximo) {
          isValid = false;
        } else {
          // Tercera validacion, si input contiene caracteres diferentes a los permitidos
          if(!pattern.test(inputN.value)){ 
          // Si queremos agregar letras acentuadas y/o letra ñ debemos usar
          // codigos de Unicode (ejemplo: Ñ: \u00D1  ñ: \u00F1)
            isValid = false;
          } else {
            // Si pasamos todas la validaciones anteriores, entonces el input es valido
            isValid = true;
            btn.hidden = false;
            
          }
        }
      }

      //Ahora coloreamos el borde de nuestro input
      if(!isValid) {
        // rojo: no es valido
        inputN.style.borderColor = 'salmon'; // me parece que 'salmon' es un poco menos agresivo que 'red'
        // mostramos mensaje
        messageN.hidden = false;
        btn.hidden = true;
      } else {
        // verde: si es valido
        inputN.style.borderColor = 'palegreen'; // 'palegreen' se ve mejor que 'green' en mi opinion
        // ocultamos mensaje;
        messageN.hidden = true;
      }

      // devolvemos el valor de isValid
      return isValid;

    }
    
    function validarApellido() {
		
      // Variable que usaremos para determinar si el input es valido
      let isValid = false;

      // El input que queremos validar
      const inputA = document.getElementById("apellido");

      
      const btn = document.getElementById("botonRegistrar");

      //El div con el mensaje de advertencia:
      const messageA = document.getElementById('messageApellido');

      inputA.willValidate = false;


      // El tamaño maximo para nuestro input
      const maximo = 35;

      // El pattern que vamos a comprobar
      const pattern = new RegExp('^[A-Z]+$', 'i');

      // Primera validacion, si input esta vacio entonces no es valido
      if(!inputA.value) {
      	
        isValid = false;
      } else {
        // Segunda validacion, si input es mayor que 35
        if(inputA.value.length > maximo) {
          isValid = false;
        } else {
          // Tercera validacion, si input contiene caracteres diferentes a los permitidos
          if(!pattern.test(inputA.value)){ 
          // Si queremos agregar letras acentuadas y/o letra ñ debemos usar
          // codigos de Unicode (ejemplo: Ñ: \u00D1  ñ: \u00F1)
            isValid = false;
          } else {
            // Si pasamos todas la validaciones anteriores, entonces el input es valido
            isValid = true;
            btn.hidden = false;
            
          }
        }
      }

      //Ahora coloreamos el borde de nuestro input
      if(!isValid) {
        // rojo: no es valido
        inputA.style.borderColor = 'salmon'; // me parece que 'salmon' es un poco menos agresivo que 'red'
        // mostramos mensaje
        messageA.hidden = false;
        btn.hidden = true;
      } else {
        // verde: si es valido
        inputA.style.borderColor = 'palegreen'; // 'palegreen' se ve mejor que 'green' en mi opinion
        // ocultamos mensaje;
        messageA.hidden = true;
      }

      // devolvemos el valor de isValid
      return isValid;

    }
    
    function validarTelefono() {
		
      // Variable que usaremos para determinar si el input es valido
      let isValid = false;

      // El input que queremos validar
      const inputT = document.getElementById("telefono");

      
      const btn = document.getElementById("botonRegistrar");

      //El div con el mensaje de advertencia:
      const messageT = document.getElementById('messageTelefono');

      inputT.willValidate = false;


      // El tamaño maximo para nuestro input
      const maximo = 8;
      // El pattern que vamos a comprobar
      const pattern = new RegExp('^(0|[1-9][0-9]*)$');

      // Primera validacion, si input esta vacio entonces no es valido
      if(!inputT.value) {
      	
        isValid = false;
      } else {
        // Segunda validacion, si input es mayor que 35
        if(inputT.value.length != maximo) {
          isValid = false;
        } else {
          // Tercera validacion, si input contiene caracteres diferentes a los permitidos
          if(!pattern.test(inputT.value)){ 
          // Si queremos agregar letras acentuadas y/o letra ñ debemos usar
          // codigos de Unicode (ejemplo: Ñ: \u00D1  ñ: \u00F1)
            isValid = false;
          } else {
            // Si pasamos todas la validaciones anteriores, entonces el input es valido
            isValid = true;
            btn.hidden = false;
            
          }
        }
      }

      //Ahora coloreamos el borde de nuestro input
      if(!isValid) {
        // rojo: no es valido
        inputT.style.borderColor = 'salmon'; // me parece que 'salmon' es un poco menos agresivo que 'red'
        // mostramos mensaje
        messageT.hidden = false;
        btn.hidden = true;
      } else {
        // verde: si es valido
        inputT.style.borderColor = 'palegreen'; // 'palegreen' se ve mejor que 'green' en mi opinion
        // ocultamos mensaje;
        messageT.hidden = true;
      }

      // devolvemos el valor de isValid
      return isValid;

    }
    
    
    
    
    

    // Por último, nuestra función que verifica si el campo es válido antes de realizar cualquier otra acción.
    function verificar() {
      const valido = validar();
      if (!valido) {
        alert('El campo no es válido.');
      } else {
        alert('El campo es válido');
      }
    }