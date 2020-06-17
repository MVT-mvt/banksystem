package com.advanced.bank.bank.system.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "user_subscriptions")
public class UserSubscription {
    @Id
    private Long id;
    @ManyToMany
    @JoinTable(
            name = "user_subscriptions_fetures",
            joinColumns = @JoinColumn(name = "user_subscription_id"),
            inverseJoinColumns = @JoinColumn(name = "feature_id" )
    )
    private Set<Feature> features = new HashSet<>();
    @ManyToMany
    @JoinTable(
            name ="user_subscriptions_festure_packages",
            joinColumns = @JoinColumn (name = " user_subscription_id"),
            inverseJoinColumns = @JoinColumn(name = "feature_package_id")
    )
    private Set<FeaturePackage> featurePackages = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Long getId() {
        return id;
    }

    public Set<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(Set<Feature> features) {
        this.features = features;
    }

    public Set<FeaturePackage> getFeaturePackages() {
        return featurePackages;
    }

    public void setFeaturePackages(Set<FeaturePackage> featurePackages) {
        this.featurePackages = featurePackages;
    }
}
