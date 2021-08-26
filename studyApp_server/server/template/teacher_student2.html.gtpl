<head>
  <meta charset="UTF-8">
  <title>講師用画面(生徒情報)</title>
  <link href="../client/css/teacher_student.css" rel="stylesheet">
</head>

<body>
  <header>
    <a class="header-logo" href="/teacher">アプリ名</a>
  </header>

  <div class="container">
    <h2>生徒情報</h2>
    <div class="contents_wrapper">
      <div class="contents">
        <ul>
          <li>氏名 : {{.St.Name}}</li>
          <li>学年 : {{.St.Grade}}</li>
          <li>中学校名 :{{.St.NowSchool}}</li>
        <li>志望校 : {{.St.WantSchool}}</li>
        </ul>
      </div>
    </div>

    <h2>お知らせ</h2>
    <div class="contents_wrapper">
      <div class="contents">
        今週は
        <div class="contents">
          {{range $nowdata:=.Tas}}
          <ul>
            <li>{{$nowdata.TextName}} の {{$nowdata.Nowpage}} ~ {{$nowdata.Allpage}}</li>
          </ul>
          {{end}}
        </div>
        
        
        を進めてください。<span class="subcontents"><a href="info_student.html"> ＊ 進捗入力画面へ移動 </a></span>
      </div>
    </div>
  </div>
    <h2>学習スケジュール</h2>
    <div class="wrapper">
      <div class="gantt">
        <div class="gantt__row gantt__row--months">
          <div class="gantt__row-first">
              月
          </div>
          <span> 4月</span><span></span><span></span><span></span>
          <span> 5月</span><span></span><span></span><span></span>
          <span> 6月</span><span></span><span></span><span></span>
          <span> 7月</span><span></span><span></span><span></span>
          <span> 8月</span><span></span><span></span><span></span>
          <span> 9月</span><span></span><span></span><span></span>
          <span>10月</span><span></span><span></span><span></span>
          <span>11月</span><span></span><span></span><span></span>
          <span>12月</span><span></span><span></span><span></span>
          <span> 1月</span><span></span><span></span><span></span>
          <span> 2月</span><span></span><span></span><span></span>
          <span> 3月</span><span></span><span></span><span></span>
        </div>
        <div class="gantt__row gantt__row--lines" data-month="5">
          <span></span><span></span><span></span><span></span>
          <span></span><span></span><span></span><span></span>
          <span></span><span></span><span></span><span></span>
          <span></span><span></span><span></span><span></span>
          <span></span><span></span><span></span><span></span>
          <span></span><span></span><span></span><span class="marker"></span>
          <span></span><span></span><span></span><span></span>
          <span></span><span></span><span></span><span></span>
          <span></span><span></span><span></span><span></span>
          <span></span><span></span><span></span><span></span>
          <span></span><span></span><span></span><span></span>
          <span></span><span></span><span></span><span></span>
        </div>
        <div class="gantt__row">
          <div class="gantt__row-first">
            国語
          </div>
          <ul class="gantt__row-bars">
            {{range $taskData:=.Taskbox.TaskJapa}}
            <li style="grid-column: {{$taskData.Start}}/{{$taskData.End}}; background-color: green;">{{$taskData.Name}}</li>
            {{end}}
          </ul>
        </div>
        <div class="gantt__row gantt__row">
          <div class="gantt__row-first">
            数学
          </div>
          {{range $taskData:=.Taskbox.TaskMath}}
        <li style="grid-column: {{$taskData.Start}}/{{$taskData.End}}; background-color: black;">{{$taskData.Name}}</li>
          {{end}}
        </div>
        <div class="gantt__row">
          <div class="gantt__row-first">
            理科
          </div>
          <ul class="gantt__row-bars">
            {{range $taskData:=.Taskbox.TaskSci}}
              <li style="grid-column: {{$taskData.Start}}/{{$taskData.End}}; background-color: red;">{{$taskData.Name}}</li>
          {{end}}
          </ul>
        </div>
        <div class="gantt__row gantt__row">
          <div class="gantt__row-first">
            社会
          </div>
          <ul class="gantt__row-bars">
            {{range $taskData:=.Taskbox.TaskSoc}}
            <li style="grid-column: {{$taskData.Start}}/{{$taskData.End}}; background-color: blue;">{{$taskData.Name}}</li>
            {{end}}
          </ul>
        </div>
        <div class="gantt__row gantt__row">
          <div class="gantt__row-first">
            英語
          </div>
          <ul class="gantt__row-bars">
            {{range $taskData:=.Taskbox.TaskEng}}
            <li style="grid-column: {{$taskData.Start}}/{{$taskData.End}}; background-color: orange;">{{$taskData.Name}}</li>
          {{end}}
          </ul>
        </div>
      </div>
    </div>
  </div>

  <footer></footer>
</body>
