<head>
  <meta charset="UTF-8">
  <title>ログイン画面</title>
  <link href="../client/css/login.css" rel="stylesheet">
</head>

<body>
<header>
  <a class="header-logo" href="/login">アプリ名</a>
</header>
  <div class="brank_head"></div>
  <div class="login_field">
    <form class="form-signin-center" role="form" action="/authenticate" method="post">
      <h2>
          スタディアプリ
      </h2>
    <form class="input_field" action="/teacher">
      <input type="text" name="userid" class="form-control" placeholder="ユーザーID" required autofocus>
      <input type="password" name="password" class="form-control" placeholder="パスワード" required>
      <input type="submit" value="ログイン">
    </form>
  </div>
</body>
