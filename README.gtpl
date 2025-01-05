<div align=center>
  
<img width="100" src="https://mansoorbarri.com/img/logo/logo.svg">
</div>

### 👷 Currently working on: 
{{ range recentContributions 3 }}
- [{{ .Repo.Name }}]({{ .Repo.URL }}) - {{ .Repo.Description }}
{{- end }}

### 🔨 Recent Pull Requests
{{ range recentPullRequests 3 }}
- [{{ .Title }}]({{ .URL }}) on [{{ .Repo.Name }}]({{ .Repo.URL }})
{{- end }}

### 📰 Recent Post
{{ range rss "https://mansoorbarri.com/index.xml" 3 }}
- [{{ .Title }}]({{ .URL }})
{{- end }}

### 📫 Reach me:
- Linkedin  : <https://linkedin.com/in/mansoorbarri/>
- Twitter   : <https://twitter.com/mansoorbarri/>
- Bluesky:  : <https://bsky.app/profile/mansoorbarri.com>
---
