/**
 * 
 */
 
 function buscarEmpleadosNombre() {
  var input, filter, table, tr, td, i, txtValue;
  
  input = document.getElementById("inputEmpleadosNombre");
  console.log(input);
  
  filter = input.value.toUpperCase();
  
  table = document.getElementById("tbEmple");
  console.log(table);
  tr = table.getElementsByTagName("tr");
  console.log(tr);
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[0];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }       
  }
}


 function buscarEmpleadosApellido() {
  var input, filter, table, tr, td, i, txtValue;
  
  input = document.getElementById("inputEmpleadosApellido");
  console.log(input);
  
  filter = input.value.toUpperCase();
  
  table = document.getElementById("tbEmple");
  console.log(table);
  tr = table.getElementsByTagName("tr");
  console.log(tr);
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[1];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }       
  }
}
