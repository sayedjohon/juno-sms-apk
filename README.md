# Juno SMS — Android SMS Gateway

<p align="center">
  <img src="https://i.ibb.co.com/F4QytpCb/Johon-1.jpg" alt="Sayed Johon" width="120" style="border-radius: 50%"/>
</p>

<p align="center">
  <strong>Built & maintained by <a href="https://www.junoverseai.com">Sayed Johon</a></strong><br/>
  Founder of JunoVerseAI · Creator of PeeAI & MicTab
</p>

---

## 📱 What is Juno SMS?

**Juno SMS** is a powerful Android app that turns your phone into an **SMS gateway** — letting you send and receive SMS messages programmatically via a simple REST API or through the Juno cloud server at `gateway.junoverseai.com`.

Perfect for:
- Automated notifications
- OTP delivery
- CRM / helpdesk integrations
- Self-hosted messaging pipelines

---

## ✨ Features

- 📡 **Cloud mode** — connect to `gateway.junoverseai.com` out of the box
- 🏠 **Local mode** — run the API server directly on your phone
- 🔒 **Secure** — JWT authentication, password protection
- 📥 **Incoming SMS** — receive & forward inbound messages via webhooks
- 🔁 **Retry logic** — automatic retry on failure
- 🔔 **Notifications** — real-time push via Firebase
- 📊 **Queue status** — live dashboard for pending/sent/failed counts

---

## 🚀 Getting Started

1. Install the APK on your Android phone (download from **Actions → Artifacts** above)
2. Open **Juno SMS** and tap **Sign Up** to create an account on `gateway.junoverseai.com`
3. Use the API to send your first SMS:

```bash
curl -X POST https://gateway.junoverseai.com/mobile/v1/message \
  -H "Authorization: Basic <base64(user:pass)>" \
  -H "Content-Type: application/json" \
  -d '{
    "message": "Hello from Juno SMS!",
    "phoneNumbers": ["+1234567890"]
  }'
```

---

## 🔧 Build From Source

```bash
git clone https://github.com/sayedjohon/juno-sms-apk.git
cd juno-sms-apk
./gradlew assembleDebug
# APK → app/build/outputs/apk/debug/
```

Or just push to `main` — **GitHub Actions** builds it automatically!

---

## 👤 About the Developer

| | |
|---|---|
| **Name** | Sayed Johon |
| **Email** | [contact.sayedjohon@gmail.com](mailto:contact.sayedjohon@gmail.com) |
| **Website** | [junoverseai.com](https://www.junoverseai.com) · [peeai.com](https://www.peeai.com) · [mictab.com](https://www.mictab.com) |
| **YouTube** | [@JunoVerseAI](https://www.youtube.com/@JunoVerseAI) |
| **Facebook** | [facebook.com/Sjohon](https://www.facebook.com/Sjohon/) |
| **Instagram** | [@sayed.johon](https://www.instagram.com/sayed.johon/) |
| **LinkedIn** | [sayedjohon](https://www.linkedin.com/in/sayedjohon/) |
| **X / Twitter** | [@sayedaljohon](https://x.com/sayedaljohon) |

---

## 📦 Projects by Sayed Johon

| Project | Description |
|---|---|
| [🧠 PeeAI](https://www.peeai.com) | AI-powered learning platform |
| [💻 MicTab](https://www.mictab.com) | All-in-one software suite |
| [🌐 JunoVerseAI](https://www.junoverseai.com) | Portfolio & AI projects hub |

---

## 📄 License

This project is based on [android-sms-gateway](https://github.com/capcom6/android-sms-gateway) by capcom6, licensed under the Apache 2.0 License.  
Modifications and branding © 2024 Sayed Johon.
