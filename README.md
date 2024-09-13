<h2>Etapas para contribuir</h2>
<hr>
<h3>1. Fork do Repositório</h3>
<p>Faça um fork do repositório clicando no botão "Fork" no GitHub.</p>
<h3>2. Clone o projeto</h3>
<p>Clone o seu fork do repositório com o comando:</p>
<p>git clone https://github.com/SEU_NOME_DE_USUARIO_GITHUB/ProjetoIntegradorIA.git</p>
<h4>3. Crie sua Branch</h4>
<p>Por boas práticas, crie uma nova branch para a funcionalidade ou correção que você vai trabalhar. Use o comando:</p>
<p>git checkout -b NOME_DA_FUNCIONALIDADE</p>
<h3>4. Faça Commits das suas Mudanças</h3>
<p>Faça commits das suas mudanças com mensagens claras e descritivas. Por exemplo:</p>
<p>git add .</p>
<p>git commit -m "Adiciona funcionalidade X"</p>
<h3>5. Atualize seu Fork</h3>
<p>Antes de enviar o pull request, certifique-se de que seu fork está atualizado com o repositório original:</p>
<p>git checkout main</p>
<p>git pull origin main</p>
<p>git checkout NOME_DA_FUNCIONALIDADE</p>
<p>git rebase main</p>
<h3>Envie seu Pull Request</h3>
<p>Depois de fazer suas alterações e garantir que seu fork está atualizado, envie seu pull request:</p>
<p>git push origin NOME_DA_FUNCIONALIDADE</p>
<p>No GitHub, vá para o seu repositório fork, encontre a sua branch e clique em "New Pull Request".</p>
