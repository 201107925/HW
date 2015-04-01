<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
?<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>login</title>
    <link href="../../Documents/yj/YJ/QU/Enterprise/hw2/homework2/css/styles.css" rel="stylesheet">
</head>

<body>
    <header>
        <div class="header">
            <img src="../../Documents/yj/YJ/QU/Enterprise/hw2/homework2/img/logo.png" alt="Hifz Tracker Logo">
            <h1>Hifz Tracker</h1>
        </div>
    </header>

    <section id="loginForm">
        <h2>Login</h2>
        <div>
            <form>
                <p>
                    <input type="text" name="username" id="username" placeholder="Username" required />
                </p>
                <p>
                    <input type="password" name="password" id="password" placeholder="Password" required />
                </p>
                <input type="submit" value="Login">
            </form>
        </div>
    </section>

</body>
</html>
