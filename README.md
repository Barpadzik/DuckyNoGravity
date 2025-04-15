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
- 🔁 Reloading plugin in game **without restart!**

---

## 🛠️ Configuration

### 📁 `config.yml`

```yaml
block-gravity:
  enabled: false # true - Gravity Enabled | false - Gravity Disabled
  disabled-worlds: # List of worlds in which the plugin will not work
    - exampleWorld1
    - exampleWorld2

fluids-gravity:
  enabled: false # true - Gravity Enabled | false - Gravity Disabled
  disabled-worlds: # List of worlds in which the plugin will not work
    - exampleWorld1
    - exampleWorld2
```

---

### 💬 `messages.yml`

```yaml
no-permission: "&9&lDuckyNoGravity &7» &cNo Permission! &6duckynogravity.reload"
reload-success: "&9&lDuckyNoGravity &7» Configuration Reloaded!"
usage: "&9&lDuckyNoGravity &7» &eUsage: /duckynogravity reload"
update-available: "&9&lDuckyNoGravity &7» &eA new version is available: &c%version%"
update-download: "&9&lDuckyNoGravity &7» &eDownload: &a%url%"
update-check-failed: "&9&lDuckyNoGravity &7» &cCould not check for updates."
```

---

### 🔁 Reloading

To apply changes made to either configuration file, use the following command:

```
/duckynogravity reload
```

This command will reload both the main configuration and the message file without the need to restart the server.

---

### 🔗 Notes

- `%version%` and `%url%` in `messages.yml` are placeholders replaced during update checking.
- Make sure world names in `disabled-worlds` match exactly with your world folder names (case-sensitive).
- Gravity settings apply only when the corresponding `enabled` flag is set to `false`.

**Permissions**                 
duckynogravity.reload - Gives TabComplete and Ability to use /duckynogravity reload

duckynogravity.update - Gives visibility to displaying update availability in chat

Enjoy customizing your gravity settings with **DuckyNoGravity**!
