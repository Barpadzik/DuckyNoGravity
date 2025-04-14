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
block-gravity:
  enabled: false # true - Gravity Enabled | false - Gravity Disabled
  allow-break: false # true - Allow Breaking Blocks with disabled gravity | false - Deny Breaking Blocks with disabled gravity
  disabled-worlds: # List of worlds in which the plugin will not work
    - exampleWorld1
    - exampleWorld2

fluids-gravity:
  enabled: false
  disabled-worlds:
    - exampleWorld1
    - exampleWorld2
