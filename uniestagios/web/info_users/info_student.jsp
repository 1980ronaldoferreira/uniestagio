<img src="img/pequenoprincipe.jpg" width="100%"/>
<hr style="margin-bottom: 5px; width: 100%;">
<div class="center-align">
    <h3> ${usuario.nome} ${usuario.sobrenome} </h3>
</div>
<hr style="margin-bottom: 5px; width: 100%;">

<ul>

    <li class="grey lighten-1">
        <span  class="black-text"><h5 class="center-align"><b> DADOS PESSOAIS</b></h5></span>
    </li>
    <div class="row">
        <li class="col s12"><b>USERNAME:</b> ${usuario.username}</li>
        <li class="col s6"><b>NOME:</b> ${usuario.nome}</li>
        <li class="col s6"><b>CPF:</b> ${usuario.cpf}</li>
        <li class="col s6" ><b>EMAIL:</b> ${usuario.email}</li>
        <li class="col 12"><b>TELEFONE:</b> ${usuario.telefone}</li> 
        <li class="col s12 offset-s10"> <a class="waves-effect waves-light btn-floating green" href="UserController?flag=edit&perfil=estudante&id=${usuario.id}"><i class="material-icons left">mode_edit</i></a></li>
    </div>

</ul>


<ul>
    <li class="grey lighten-1">
        <span  class="black-text"><h5 class="center-align"><b> DADOS ENDEREÇO</b></h5></span>
    </li>
    <div class="row">

        <li class="col s9"><b>Logradouro:</b> ${endereco.logradouro}</li> 
        <li class="col s3"><b>N°</b> ${endereco.numero}</li> 
        <li class="col s6"><b>Bairro:</b> ${endereco.bairro}</li> 
        <li class="col s12"><b>CEP:</b> ${endereco.cep}</li> 
        <li class="col s12"><b>Complemento:</b> ${endereco.complemento}</li> 
        <li class="col s12 offset-s10"> <a class="waves-effect waves-light btn-floating green" href="UserController?flag=edit&perfil=estudante&id=${usuario.id}"><i class="material-icons left">mode_edit</i></a></li>
        

    </div>
</ul>

<ul>

    <li class="grey lighten-1">
        <span  class="black-text"><h5 class="center-align"><b> DADOS ENDEREÇO</b></h5></span>
    </li>



</ul>

<ul>

    <li class="grey lighten-1">
        <span  class="black-text"><h5 class="center-align"><b> DADOS ENDEREÇO</b></h5></span>
    </li>



</ul>