<head>
    <meta charset="UTF-8">
    <title>講師用画面(新規生徒登録)</title>
    <link href="../client/css/register.css" rel="stylesheet">
  </head>
  
  <body>
  <header>
    <a class="header-logo" href="teacher.html">アプリ名</a>
  </header>
  
  <div class="register_wrapper">
  <div class=container>
      <h1>登録内容確認</h1>
  
  <div class="check_field">
    <ul>
      <li class="contents"> 学年　　　: {{.Grade}}
      </li>
      <li class="contents"> 担当講師　: {{.Teacher_name}}
      </li>
      <li class="contents"> 中学校　　: {{.NowSchool}}
      </li>
      <li class="contents"> 志望校　　: {{.WantSchool}}
      </li>
    </ul>
  </div>
  <div class="button_field right">
  
  <form action="/teacher">
    <input  type="submit" value="登録">
  </form>
  
  <!-- ==保留== -->
  <form action="/teacher">
    <input  type="submit" value="修正">
  </form>
  </div>
  </div>
  </div>
  </body>
  