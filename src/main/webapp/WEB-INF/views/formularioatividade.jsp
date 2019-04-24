<%@page pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Fomulario Atividade</title>
    <meta name="viewport" content="wnameth=device-wnameth, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
</head>

<body>
    <form action="addsede.html" method="post">
        <fieldset>
            <legend>Dados Pessoais</legend>
            <table cellspacing="10">
                <tr>
                    <td>
                        <label for="nome">Nome Completo: </label>
                    </td>
                    <td align="left">
                        <input type="text" name="email">
                    </td>

                </tr>
                <tr>
                        <td>
                            <label for="nome">Site: </label>
                        </td>
                        <td align="left">
                            <input type="text" name="email">
                        </td>
    
                    </tr>
                <tr></tr>
                </tr>
                </tr>
            </table>
        </fieldset>

        <br />
        <!-- ENDEREÇO -->
        <fieldset>
            <legend>Dados de Endereço</legend>
            <table cellspacing="10">

                <tr>
                    <td>
                        <label for="rua">Rua:</label>
                    </td>
                    <td align="left">
                        <input type="text" name="rua">
                    </td>
                    <td>
                        <label for="numero">Telefone:</label>
                    </td>
                    <td align="left">
                        <input type="text" name="numero" size="10">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="bairro">Bairro: </label>
                    </td>
                    <td align="left">
                        <input type="text" name="bairro">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="estado">Estado:</label>
                    </td>
                    <td align="left">
                        <select name="estado">
                            <option value="ac">Acre</option>
                            <option value="al">Alagoas</option>
                            <option value="am">Amazonas</option>
                            <option value="ap">Amapá</option>
                            <option value="ba">Bahia</option>
                            <option value="ce">Ceará</option>
                            <option value="df">Distrito Federal</option>
                            <option value="es">Espírito Santo</option>
                            <option value="go">Goiás</option>
                            <option value="ma">Maranhão</option>
                            <option value="mt">Mato Grosso</option>
                            <option value="ms">Mato Grosso do Sul</option>
                            <option value="mg">Minas Gerais</option>
                            <option value="pa">Pará</option>
                            <option value="pb">Paraíba</option>
                            <option value="pr">Paraná</option>
                            <option value="pe">Pernambuco</option>
                            <option value="pi">Piauí</option>
                            <option value="rj">Rio de Janeiro</option>
                            <option value="rn">Rio Grande do Norte</option>
                            <option value="ro">Rondônia</option>
                            <option value="rs">Rio Grande do Sul</option>
                            <option value="rr">Roraima</option>
                            <option value="sc">Santa Catarina</option>
                            <option value="se">Sergipe</option>
                            <option value="sp">São Paulo</option>
                            <option value="to">Tocantins</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="cidade">Cidade: </label>
                    </td>
                    <td align="left">
                        <input type="text" name="cidade">
                    </td>
                </tr>
            </table>
        </fieldset>
        <br />

        <input type="submit" value="Salvar" />
        <br/>
    </form>
</body>

</html>