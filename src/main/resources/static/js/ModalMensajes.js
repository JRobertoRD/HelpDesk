/**
 * 
 */


function eliminar(id) {
	swal({
		title: "Esta seguro de eliminar?",
		text: "Una vez eliminado no podra recuperar lo eliminado",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url:"/ServiController/delete/"+id,
					success: function(res) {
						console.log(res);
					}
				});
				swal("Registro eliminado con exito", {
					icon: "success",
					buttons: false,
					timer: 1000
				}).then(()=>{
						location.href="/ServiController/listarServicios"
					
				});
			} else {
				swal("No se elimino ningun registro!!");
			}
		});
}

function editar(id) {
	swal({
		title: "Seguro que desea editar el registro?",
		text: "Una vez editado, se cambiaran los datos.",
		icon: "warning",
		buttons: true,
		dangerMode: true,
		
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url:"ServiController/edit/"+id,
					success: function(res) {
						console.log(res);
					}
				});
				swal("Listo, Vamos a editar!", {
					icon: "success",
					buttons: false,
					timer: 1000
				}).then(()=>{			
						location.href="/ServiController/edit/"+id;
					
				});
			} else {
				swal("No se edito ningun registro!");
			}
		});
}


function eliminarEmple(id) {
	swal({
		title: "Esta seguro de eliminar?",
		text: "Una vez eliminado no podra recuperar lo eliminado",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url:"/empleadoController/delete/"+id,
					success: function(res) {
						console.log(res);
					}
				});
				swal("Registro eliminado con exito", {
					icon: "success",
					buttons: false,
					timer: 1000
				}).then(()=>{
						location.href="/empleadoController/listarEmpleados"
					
				});
			} else {
				swal("No se elimino ningun registro!!");
			}
		});
}

function editarEmple(id) {
	swal({
		title: "Seguro que desea editar el registro?",
		text: "Una vez editado, se cambiaran los datos.",
		icon: "warning",
		buttons: true,
		dangerMode: true,
		
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url:"ServiController/edit/"+id,
					success: function(res) {
						console.log(res);
					}
				});
				swal("Listo, Vamos a editar!", {
					icon: "success",
					buttons: false,
					timer: 1000
				}).then(()=>{			
						location.href="/empleadoController/edit/"+id;
					
				});
			} else {
				swal("No se edito ningun registro!");
			}
		});
}