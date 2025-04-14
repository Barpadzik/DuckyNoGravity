# 🪐 DuckyNoGravity

**Disable gravity for blocks and fluids in Minecraft – from 1.16.5 to the latest version!**  
Lightweight, efficient, and fully customizable via `config.yml`.

---

## 📦 Description

**DuckyNoGravity** is a lightweight plugin that completely disables gravity for certain blocks (like sand and gravel) and fluids (water and lava).  
Perfect for building, creative maps, or wacky game modes with zero physics!

---

## ⚙️ Features

- ✅ Disables gravity for blocks like sand, gravel, and concrete powder  
- 🌊 Stops water and lava from flowing  
- 🧱 Prevents entity block updates (e.g., falling blocks)  
- 🗺️ Per-world configuration support  
- ⚙️ Simple `config.yml` customization  
- 📦 Supports **Minecraft 1.16.5 → latest (1.21+)**  
- ☕ Compiled with **Java 16**

---

## 🛠️ Configuration (`config.yml`)

```yaml
block-gravity: true # Disables gravity for sand, gravel, etc.
  allow-break: true # Allows breaking blocks manually if stuck
  disabled-worlds:  # These worlds are unaffected by the plugin
    - exampleWorld1
    - exampleWorld2

fluids-gravity: true # Disables water/lava flow
  disabled-worlds:   # These worlds are unaffected by the plugin
    - exampleWorld1
    - exampleWorld2
