<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Cadastro de Usuários</h1>
    <hr>
    <form method="post">
        <p>Usuários</p>
        <input type="email" name="usuario" require placeholder="informe seu email">
        <p>Senha</p>
        <input type="password" name="senha" require placeholder="informe sua senha">
        <br>
        <input type="submit" value="enviar" name="enviar">
    </form>
    <?php 
        /*addslashess usado para 
        combater código malicioso como comandos de invasão*/ 

        if(isset($_POST['enviar'])){
            echo 'Botão enviar pressionado, dados serão armazenado';
            
            $usuario = stripslashes(htmlspecialchars(addslashes(strtoupper(trim($_POST['usuario']))),ENT_QUOTES));
            $senha = stripslashes(htmlspecialchars(addslashes(md5(trim($_POST['senha']))),ENT_QUOTES));
            echo '<br>usuário ' . $usuario;
            echo '<br>senha ' . $senha;

            $localhost ="localhost";
            $database="Banco";
            $usuario="root";
            $senha="";

            $conexao = mysqli_connect($localhost, $usuario, $senha, $database);

            if(mysqli_errno($conexao)){
                echo 'No momento estamos com dificuldades. Tente mais tarde';
            }else{
                echo 'Seja bem-vindo ao nosso Sistema';

                $sql = "insert into usuario(usuario,senha) values ('$usuario','$senha')";
                $executar = mysqli_execute_query($conexao,$sql);
                if(mysqli_num_rows($executar)){
                    echo '<br>';
                    echo 'dados armazenados com sucesso';
                }else{
                    echo '<br>';
                    echo 'não foi possível armazenar os dados';
                }
            }
        }
    ?>
</body>
</html>