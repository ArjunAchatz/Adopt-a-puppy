package com.example.adopt_a_pup

import kotlin.random.Random

object PuppyRepo {
    val puppies = listOf(
        Puppy(
            name = "50 cent",
            age = Random.nextInt(1, 10),
            gender = Gender.values()[Random.nextInt(0, 2)],
            breed = "english cocker spaniel",
            imageUrl = "https://previews.123rf.com/images/melnyk58/melnyk581906/melnyk58190602199/124787220-looking-so-sweet-and-full-of-hope-english-cocker-spaniel-young-dog-is-posing-cute-playful-braun-dogg.jpg",
        ),
        Puppy(
            name = "Tiesto",
            age = Random.nextInt(1, 10),
            gender = Gender.values()[Random.nextInt(0, 2)],
            breed = "French bull dog",
            imageUrl = "https://previews.123rf.com/images/lightfieldstudios/lightfieldstudios1811/lightfieldstudios181116755/111505216-cute-frenchie-dog-lying-on-floor-and-looking-up.jpg",
        ),
        Puppy(
            name = "Luna Tuna",
            age = Random.nextInt(1, 10),
            gender = Gender.values()[Random.nextInt(0, 2)],
            breed = "aussie doodle",
            imageUrl = "https://previews.123rf.com/images/serezniy/serezniy1810/serezniy181037677/110403211-cute-puppy-sitting-on-carpet-near-wet-spot.jpg",
        ),
        Puppy(
            name = "Britney Spears",
            age = Random.nextInt(1, 10),
            gender = Gender.values()[Random.nextInt(0, 2)],
            breed = "spaniel",
            imageUrl = "https://previews.123rf.com/images/melnyk58/melnyk581905/melnyk58190500358/121835424-spaniel-puppy-playing-in-studio-cute-doggy-or-pet-is-sitting-isolated-on-blue-background-the-cavalie.jpg",
        ),
        Puppy(
            name = "John Wick",
            age = Random.nextInt(1, 10),
            gender = Gender.values()[Random.nextInt(0, 2)],
            breed = "irish",
            imageUrl = "https://previews.123rf.com/images/hannamariah/hannamariah1601/hannamariah160100003/51331749-irish-setter-puppy-wearing-valentine-glasses-.jpg",
        ),
        Puppy(
            name = "Justin Timberlake",
            age = Random.nextInt(1, 10),
            gender = Gender.values()[Random.nextInt(0, 2)],
            breed = "welsh corgi",
            imageUrl = "https://previews.123rf.com/images/olgagorovenko/olgagorovenko1811/olgagorovenko181100016/113668451-funny-welsh-corgi-pembroke-running-with-tongue-out.jpg",
        ),
        Puppy(
            name = "Christina Aguilera",
            age = Random.nextInt(1, 10),
            gender = Gender.values()[Random.nextInt(0, 2)],
            breed = "bulldog",
            imageUrl = "https://previews.123rf.com/images/rawpixel/rawpixel1901/rawpixel190104089/115931076-adorable-white-bulldog-puppy-portrait.jpg",
        ),
        Puppy(
            name = "Missy Elliott",
            age = Random.nextInt(1, 10),
            gender = Gender.values()[Random.nextInt(0, 2)],
            breed = "welsh corgi",
            imageUrl = "https://previews.123rf.com/images/melnyk58/melnyk581904/melnyk58190402146/121507752-smile-to-me-welsh-corgi-pembroke-puppy-is-posing-cute-fluffy-doggy-or-pet-is-sitting-isolated-on-red.jpg",
        ),
        Puppy(
            name = "Jax",
            age = Random.nextInt(1, 10),
            gender = Gender.values()[Random.nextInt(0, 2)],
            breed = "beagle",
            imageUrl = "https://previews.123rf.com/images/golfyinterlude/golfyinterlude1601/golfyinterlude160100004/51350048-little-puppy-beagle-dog-running-zoom-in.jpg",
        ),
        Puppy(
            name = "Rambo",
            age = Random.nextInt(1, 10),
            gender = Gender.values()[Random.nextInt(0, 2)],
            breed = "pug",
            imageUrl = "https://previews.123rf.com/images/dixi_/dixi_1512/dixi_151200115/50274506-funny-pug-puppy-looking-at-the-camera-isolated-on-white-.jpg",
        ),
        Puppy(
            name = "Kane",
            age = Random.nextInt(1, 10),
            gender = Gender.values()[Random.nextInt(0, 2)],
            breed = "french bulldog",
            imageUrl = "https://previews.123rf.com/images/kozorog/kozorog1606/kozorog160600070/57818928-funny-dog-playing-with-toilet-paper-dog-french-bulldog-puppy-black-color-background-wood.jpg",
        ),
    )
}