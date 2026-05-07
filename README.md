# 💰 Pricing Engine - Refactoring Lab

## 📌 Project Description
This project is a refactored pricing engine that calculates the final price of an order using:
- Discount strategies (SAVE10, SAVE20, VIP)
- Tax calculation (19%)
- Clean architecture using Strategy Design Pattern

---

## 🧠 Features
- Subtotal calculation
- Flexible discount system (Strategy Pattern)
- Tax service (19%)
- Unit tests (console-based)
- Clean OOP design

---

## 🏗️ Architecture

The project follows **Strategy Design Pattern**:

- `DiscountStrategy` → Interface
- `Save10`, `Save20`, `VipDiscount`, `NoDiscount` → Implementations
- `PricingEngine` → Core logic
- `Order` → Data model
- `TaxService` → Tax calculation

---

## 📁 Project Structure
