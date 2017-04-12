<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="css/Style.css" type="text/css" />
<title>Interface Connexion Conseiller</title>
</head>
<body>
  <p>
  	<label for="login">Identifiant</label>
  	<input type="text" tabindex="10" size="20" value="entrez votre login" id="user_login" name="log">
  </p>
  <p>
 	 <label for="password">Mot de passe</label>
  	<input type="password" tabindex="20" size="20" value="" id="user_pass" name="password">
  </p>
 <p><label><input type="checkbox" tabindex="90" value="forever" id="rememberme" name="rememberme">
  Rester connecter</label>
  | <a href="http://www.NOM_DU_SITE.com/wp-login.php?action=lostpassword">Mot de passe oublié</a></p>
  <p>
 	 <input type="submit" tabindex="100" value="Se connecter" id="wp-submit" name="wp-submit">
 	 <input type="hidden" value="http://www.NOM_DU_SITE.com/" name="redirect_to">
  </p>

</body>
</html>