# Heroes app

## MainActivity
- Actividad de inicio de sesión.
- Clase User para autenticación.
- Lista estática de usuarios válidos.
- Validación de email y mensaje de error en caso de ser inválido.
- Navegación al PublisherActivity con SharedPreferences para gestionar la sesión.

![login](https://github.com/PepeMP23/JMunetonHeroesApp/assets/80652947/b93cb6df-4f17-43fa-9f54-2f0b51fef88b)


## PublisherActivity
- Lista de publishers Marvel y DC con RecyclerView.
- Clase `Publisher` con propiedades `id`, `name`, e `image` (URL como String para cargar con Picasso).
- Navegación a HeroesActivity al seleccionar Marvel o DC.
- Botón para cerrar sesión.

![publishers](https://github.com/PepeMP23/JMunetonHeroesApp/assets/80652947/d3971d6f-0598-459c-8c3e-3098521ae5dc)

## HeroesActivity
- Lista de héroes del publisher seleccionado con RecyclerView.
- Navegación a HeroDetailActivity al seleccionar un héroe.

![marvelHeroes](https://github.com/PepeMP23/JMunetonHeroesApp/assets/80652947/bb0fdba9-e963-42e4-90db-0a2f71cea7fa)
![DCHeroes](https://github.com/PepeMP23/JMunetonHeroesApp/assets/80652947/5cb5091f-b5d4-43d8-b4d1-95de0bac25e6)

## HeroDetailActivity
- Detalles del héroe: nombre, descripción, imagen con Picasso.
- Filtrado por id desde lista estática de héroes.




![MarvelHeroDetail](https://github.com/PepeMP23/JMunetonHeroesApp/assets/80652947/40d3fc92-9840-4104-9585-34288f1cfa2a)
![DcHeroesDetail](https://github.com/PepeMP23/JMunetonHeroesApp/assets/80652947/5be8dab8-858d-43b1-97e3-498dd95e58ad)
