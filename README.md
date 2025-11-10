# 🧾 ProminerGST — Centralized GST Management System (Java ERP)

**ProminerGST** (2016–2017) is a **Java-based ERP software** designed to automate Goods and Services Tax (GST) compliance, accounting, and payroll for businesses under the Indian GST framework.
Built with a modular architecture and adaptive compliance logic, it centralizes all financial and taxation processes into a single, easy-to-use interface.

---

## 🚀 Overview

ProminerGST was developed as a desktop-based ERP integrating:

* **GST Filing & Reports**
* **Accounting and Payroll**
* **Ledger & Profit/Loss Statements**
* **Document-linked Tax Acts**
* **Audit-ready Data Management**

It leverages a *compliance engine* that references local GST Acts and Rules, ensuring tax rules and filing formats remain synchronized with government updates.

---

## 🧩 Key Features

### 💼 GST Automation

* Auto-calculates CGST, SGST, IGST, and Cess.
* Manages both inward and outward supply invoices.
* Built-in modules for **e-Return filing** and **audit generation**.

### 🗂️ Modular ERP Dashboard

Each function is represented as a module accessible from the home interface:

* Purchase / Invoice / Balance Sheet
* Profit & Loss Account
* GST E-Return Filing
* Premium Payroll
* Virtual Bank
* Database Control

### ⚙️ Adaptive Compliance Engine

* Loads legal reference PDFs (CGST, IGST, UTGST, etc.) directly from the `/Prominer` directory.
* Dynamically updates report templates and logic based on new rules.

### 🔒 Security & Access Control

* Includes an `InactivityListener` to auto-logout after 10 minutes of idle time.
* Session-based authentication and database configuration options.

### 💰 Payroll + Virtual Banking

* Automated payroll with GST-compliant deductions.
* Simulated financial transactions for ledger and audit validation.

---

## 🧠 Technical Architecture

| Component           | Description                                                           |
| ------------------- | --------------------------------------------------------------------- |
| **Language**        | Java (Swing / AWT GUI)                                                |
| **Database**        | Local (configurable)                                                  |
| **UI Core**         | `Home.java` main dashboard with modular event handlers                |
| **Compliance Docs** | Local system files — CGST, IGST, UTGST, GST Payment, Exemptions, Cess |
| **Session Control** | Custom `InactivityListener` (auto logout after 10 mins)               |
| **Report Engine**   | Dynamic PDF reference invocation using `Runtime.getRuntime().exec()`  |

---

## 🖼️ Screenshot

![ERP Home Dashboard](https://smatter.app/ERP_Home.png)

---

## 📂 Directory Structure

```
ProminerGST/
├── src/
│   ├── Home.java
│   ├── InactivityListener.java
│   ├── Payroll.java
│   ├── GSTReturn.java
│   ├── Ledger.java
│   └── ...
├── resources/
│   ├── CGST_ACT.pdf
│   ├── IGST_ACT.pdf
│   ├── GST_PAYMENT_PROCESS.pdf
│   └── ...
└── ERP-Home.png
```

---

## 🧾 License

This project is © 2016–2017 **Parth Shah**.
All rights reserved. Redistribution or commercial use requires explicit written permission.

---

## 👨‍💻 Author

**Parth Shah**
Founder, [Smatter LLP](https://smatter.app)
*Developer of SerenePay, ProminerGST..*
