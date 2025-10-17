# 🖥️ SplashScreen
> Aplicativo Android em **Java** para simular uma loading screen.

---

## 📱 Visão Geral

O **Troca de Telas** é um aplicativo Android desenvolvido para **Trocar de tela** contendo os dados fornecidos.  
Com uma **interface moderna e intuitiva**, o app permite inserir nome e idade e mostrando um texto personalizado.

---

## 🚀 Funcionalidades

✅ **Inserir** – Insira nome e idade

✅ **Exibição Inteligente** – Troca a tela mostrando uma texto com seu nome e idade

✅ **Interface Moderna** – Interface personalizada com detalhes simples

✅ **Funcionalidade** – Funcionalidade simples, basta adicionar nome e idade e clicar no botão

---

## 🛠️ Tecnologias Utilizadas

- **Java** – Linguagem principal
- **Android SDK** – Framework de desenvolvimento
- **XML** – Criação de layouts e interfaces
- **Material Design** – Componentes de UI modernos
- **RelativeLayout** – Layouts organizados
- **Gradle** – Gerenciamento de dependências

---

## ⚙️ Como Executar

**Pré-requisitos:**
- Android Studio (versão mais recente)
- Emulador Android ou dispositivo físico com API 21+

**Passos:**
```bash
# 1. Clone o repositório
git clone https://github.com/EleandersonRosadeMorais/SplashScreen

# 2. Acesse a pasta
cd SplashScreen

# 3. Abra no Android Studio
"C:\Program Files\Android\Android Studio\bin\studio64.exe" .

# 4. Execute o app
# (Shift + F10 ou Run 'app')
```

---

## 📂 Estrutura do Projeto

```bash
📦 app
├── 📂 manifests/
│   └── AndroidManifest.xml
├── 📂 java/
│   └── 📂br.ulbra.SpashScreen/
│       ├── MainActivity.java
│       └── SplashActivity.java
└── 📂 res/
     ├── 📂 anim/
     │   └── fade_in.xml
     ├── 📂 drawable/
     │   └── logo.png
     ├── 📂 layout/
     │   ├── activity_main.xml
     │   └── activity_splash.xml
     ├── 📂 mipmap/
     ├── 📂 values/
     └── 📂 xml/
 📂 Gradle Scripts/
```

---

## 💻 Exemplo de Código

```java
        new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        Intent i = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
```

---

## 🎯 Objetivo do Projeto

Projeto desenvolvido com fins educacionais, com foco em:
- Práticas de programação **Java para Android**
- Uso de **Material Design** e boas práticas de UI/UX
- Estruturação e gerenciamento de dados no app
- Organização de código e arquitetura limpa
- Melhora continua da criatividade
- Desenvolvimento prático de **.xml** com **.java**

---

## 👤 Autor

**Eleanderson Rosa de Morais**  
📧 eleandersonmorais@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/eleanderson-rosa-de-morais-9aaab9324/)  
🔗 [GitHub](https://github.com/EleandersonRosadeMorais/)

---

## 💬 Contato

Dúvidas, sugestões ou colaborações?  
Entre em contato por email ou via redes sociais.  
Contribuições são bem-vindas! 🚀